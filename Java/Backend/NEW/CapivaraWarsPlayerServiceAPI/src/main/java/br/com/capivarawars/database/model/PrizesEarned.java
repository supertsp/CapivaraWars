package br.com.capivarawars.database.model;

// <editor-fold defaultstate="collapsed" desc="imports...">
import static br.com.capivarawars.endpoint.config.EndpointsMapping.*;
import br.com.capivarawars.database.repository.*;
import br.com.capivarawars.endpoint.client.*;
import br.com.capivarawars.endpoint.config.*;
import br.com.capivarawars.endpoint.handler.*;
import br.com.capivarawars.security.*;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

import br.com.capivarawars.security.Cryptography;
import br.com.capivarawars.tool.JsonHandler;
import com.fasterxml.jackson.annotation.*;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author Tiago Penha Pedroso, 17/11/2019, 15:44:00 Last update: -
 */// </editor-fold>
@Entity
@Table(name = "PRIZ_EARNED",
		indexes = {
			@Index(name = "INDEX_PRIZE_EARNED_ID_PRIZE", columnList = "ID_PRIZE")
})
public class PrizesEarned {

	// <editor-fold defaultstate="collapsed" desc="Database fields...">
	@Id
	@GeneratedValue
	@Column(name = "ID_PRIZE_EARNED")
	private Long idPrizeEarned;
	
	@Column(name = "PRIZE_DATETIME", columnDefinition = "DATETIME")
	private LocalDateTime prizeDateTime;
	
	@Column(name = "ID_PRIZE")
	private Long idPrize;
	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="Relationships fields...">
	@ManyToOne
    @JoinColumn(name = "ID_PLAYER")
	private Player playerFK;
	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="constants fields...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="constructors...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="methods...">

	// <editor-fold defaultstate="collapsed" desc="getter and setter methods...">

	public Long getIdPrizeEarned() {
		return idPrizeEarned;
	}

	public void setIdPrizeEarned(Long idPrizeEarned) {
		this.idPrizeEarned = idPrizeEarned;
	}

	public LocalDateTime getPrizeDateTime() {
		return prizeDateTime;
	}

	public void setPrizeDateTime(LocalDateTime prizeDateTime) {
		this.prizeDateTime = prizeDateTime;
	}

	public Long getIdPrize() {
		return idPrize;
	}

	public void setIdPrize(Long idPrize) {
		this.idPrize = idPrize;
	}
	
	@JsonIgnore
	public Player getPlayerFK() {
		return playerFK;
	}
	
	@JsonIgnore
	public void setPlayerFK(Player playerFK) {
		this.playerFK = playerFK;
	}
	
	public Long getPlayerId(){
		if (playerFK != null) {
			return playerFK.getIdPlayer();
		}
		
		return null;
	}	
	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="override methods...">
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + JsonHandler.toString(this);
	}
	// </editor-fold>    

	// <editor-fold defaultstate="collapsed" desc="main methods...">
	@JsonIgnore
	public boolean isValidObject() {
        return playerFK != null
                && idPrize != null;
    }
	// </editor-fold>

	// </editor-fold>
		
}//class
