package com.galbern.budget.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="Stages")
//@Embeddable // again not a Value object
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stageId;
    private String name;
    private short stageNum;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn( name="project_id", nullable = false) // here stage owns the rlnshp
    private Project project;
    @OneToMany(mappedBy="stage", fetch=FetchType.LAZY, cascade = CascadeType.ALL) // Items is owner of the rlshnp
    private Set<Item> items;
    Boolean isActive;

    public Stage() {

    }

    public Stage(String name, short stageNum, Project project) {
        this.name = name;
        this.stageNum = stageNum;
        this.project = project;
        isActive = true;
    }

    public void setStageId(long stageId) {
        this.stageId = stageId;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public long getStageId() {
        return stageId;
    }

    public String getName() {
        return name;
    }

    public short getStageNum() {
        return stageNum;
    }

    public Project getProject() {
        return project;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStageNum(short stageNum) {
        this.stageNum = stageNum;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stage)) return false;

        Stage stage = (Stage) o;

        if (stageId != stage.stageId) return false;
        if (stageNum != stage.stageNum) return false;
        if (name != null ? !name.equals(stage.name) : stage.name != null) return false;
        return project != null ? project.equals(stage.project) : stage.project == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (stageId ^ (stageId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) stageNum;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + stageId +
                ", name='" + name + '\'' +
                ", stageNum=" + stageNum +
//                ", project=" + project +
                '}';
    }
}
