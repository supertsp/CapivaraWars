package br.com.capivarawars.database.model;

//<editor-fold defaultstate="collapsed" desc="imports...">
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

import javax.persistence.*;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author TPEDROSO, 23/10/2019, 13:11:44 Last update: -
 *///</editor-fold>
@Entity
@Table(name = "COR")
public class Cor {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    @Id
    @GeneratedValue
    @Column(name = "ID_COR")
    private Long idCor;

    @Column(name = "NOME", length = VARCHAR_LENGTH_NOME)
    private String nome;

    @Column(name = "RGBA", length = CHAR_LENGTH_RGBA, columnDefinition = "CHAR")
    private String rgba;

    /**
     * RELATIONSHIPS
     */
	@JsonIgnore
    @OneToMany(mappedBy = "corFK")
    private List<Capivara> listaDeCapivaras;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    public static final int VARCHAR_LENGTH_NOME = 120,
            CHAR_LENGTH_RGBA = 9;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    //</editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="methods...">
    //<editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    public Long getIdCor() {
        return idCor;
    }

    public Cor setIdCor(Long idCor) {
        this.idCor = idCor;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getRgba() {
        return rgba;
    }

    public Cor setRgba(String rgba) {
        this.rgba = rgba;
        return this;
    }

    /**
     * RELATIONSHIPS
     */
    public List<Capivara> getListaDeCapivaras() {
        return listaDeCapivaras;
    }

    public Cor setListaDeCapivaras(List<Capivara> listaDeCapivaras) {
        this.listaDeCapivaras = listaDeCapivaras;
        return this;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="override methods...">
    //</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="static methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    public boolean preencheuCamposObrigatorios() {
        return nome != null
                && rgba != null;
    }
    //</editor-fold>
    //</editor-fold>

}//class
