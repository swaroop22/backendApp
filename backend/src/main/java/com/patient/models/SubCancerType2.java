package com.patient.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subcancertype2")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SubCancerType2 implements Serializable {
    @Column(name = "pk")
    @Id
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "subcancer_type1_id")
    private int subcancertypeid;

    @ManyToOne
    @JoinColumn(name = "id")
    private SubCancerType1 subCancerType1;
}
