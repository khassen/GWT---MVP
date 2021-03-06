package com.formation.adhesion.ods.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Statistiques Adhesion en temps reel Le stockage est realise dans une table
 * partitionnee Le partitionnement est realise suivant le jour + heure stocke
 * dans le champ statDatetime
 * 
 * La table a 20 tablespaces differents permettant de garder les 20 derniers
 * jours
 * 
 * @author Axel Prieur
 * 
 */
@Entity
@Table(name = "STATISTICS")
public class Statistics implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5757616225448453043L;

	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "STAT_SEQ")
	@SequenceGenerator(name = "STAT_SEQ", sequenceName = "STAT_SEQ")
	@Id
	private Long id;

	@Column(name = "DAY_OF_YEAR", nullable = false, length = 3)
	private String dayofyear;
	@Column(name = "HOUR_SLOT", nullable = false, length = 2)
	private String hourslot;
	@Column(name = "SERVICENUMBER", nullable = false, length = 8)
	private String servicenumber;
	@Column(name = "ORIGINTYPE", nullable = false, length = 1)
	private String originetype;
	@Column(name = "CLIENTAPP", nullable = false, length = 8)
	private String clientapp;
	@Column(name = "DOMAIN", nullable = false, length = 20)
	private String domain;
	@Column(name = "VALUELEVEL", nullable = false, length = 3)
	private String valuelevel;
	@Column(name = "CLIENTIDENTITY", nullable = false, length = 8)
	private String clientidentity;
	@Column(name = "SERVERAPP", nullable = false, length = 8)
	private String serverapp;
	@Column(name = "CONNECTIONTYPE", nullable = false, length = 1)
	private String connectiontype;
	@Column(name = "PROTOCOL", nullable = false, length = 6)
	private String protocol;
	@Column(name = "GEOGRIPHICSITE", nullable = false, length = 3)
	private String geographicsite;
	@Column(name = "TECHNOTYPE", nullable = false, length = 4)
	private String technotype;
	@Column(name = "SERVERNAME", nullable = false, length = 50)
	private String servername;
	@Column(name = "EXECUTIONENVIRONMENT", nullable = false, length = 1)
	private String executionenvironment;

	@Column(name = "MINIMUMDURATION", nullable = false)
	private Long minimumduration;
	@Column(name = "AVERAGEDURATION", nullable = false)
	private Long averageduration;
	@Column(name = "MAXIMUMDURATION", nullable = false)
	private Long maximumduration;
	@Column(name = "NUMBEROFSERVICE", nullable = false)
	private Long numberofservice;
	@Column(name = "NUMBEROFERRORS", nullable = false)
	private Long numberoferrors;
	@Column(name = "NUMBEROFBYTES", nullable = false)
	private Long numberofbytes;
	@Column(name = "NUMBERBELOW100", nullable = false)
	private Long numberbelow100;
	@Column(name = "NUMBERBETWEEN100500", nullable = false)
	private Long numberbetween100500;
	@Column(name = "NUMBERBETWEEN5001000", nullable = false)
	private Long numberbetween5001000;
	@Column(name = "NUMBERBETWEEN10002000", nullable = false)
	private Long numberbetween10002000;
	@Column(name = "NUMBERBETWEEN20005000", nullable = false)
	private Long numberbetween20005000;
	@Column(name = "NUMBERBETWEEN500010000", nullable = false)
	private Long numberbetween500010000;
	@Column(name = "NUMBERBETWEEN1000030000", nullable = false)
	private Long numberbetween1000030000;
	@Column(name = "NUMBERUPPER30000", nullable = false)
	private Long numberupper30000;

	
	public String getKey() {
		
		String key = getDayofyear().substring(0, 3)
				+ getHourslot().substring(0, 2)
				+ getServicenumber().substring(0, 8)
				+ getOriginetype().substring(0, 1)
				+ getClientapp().substring(0, 8) + getDomain().substring(0, 20)
				+ getValuelevel().substring(0, 3)
				+ getClientidentity().substring(0, 8)
				+ getServerapp().substring(0, 8)
				+ getConnectiontype().substring(0, 1)
				+ getProtocol().substring(0, 6)
				+ getGeographicsite().substring(0, 3)
				+ getTechnotype().substring(0, 4)
				+ getServername().substring(0, 50)
				+ getExecutionenvironment().substring(0, 1);
		return key;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDayofyear() {
		return dayofyear;
	}

	public void setDayofyear(String dayofyear) {
		this.dayofyear = dayofyear;
	}

	public String getHourslot() {
		return hourslot;
	}

	public void setHourslot(String hourslot) {
		this.hourslot = hourslot;
	}

	public String getServicenumber() {
		return servicenumber;
	}

	public void setServicenumber(String servicenumber) {
		this.servicenumber = servicenumber;
	}

	public String getOriginetype() {
		return originetype;
	}

	public void setOriginetype(String originetype) {
		this.originetype = originetype;
	}

	public String getClientapp() {
		return clientapp;
	}

	public void setClientapp(String clientapp) {
		this.clientapp = clientapp;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getValuelevel() {
		return valuelevel;
	}

	public void setValuelevel(String valuelevel) {
		this.valuelevel = valuelevel;
	}

	public String getClientidentity() {
		return clientidentity;
	}

	public void setClientidentity(String clientidentity) {
		this.clientidentity = clientidentity;
	}

	public String getServerapp() {
		return serverapp;
	}

	public void setServerapp(String serverapp) {
		this.serverapp = serverapp;
	}

	public String getConnectiontype() {
		return connectiontype;
	}

	public void setConnectiontype(String connectiontype) {
		this.connectiontype = connectiontype;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getGeographicsite() {
		return geographicsite;
	}

	public void setGeographicsite(String geographicsite) {
		this.geographicsite = geographicsite;
	}

	public String getTechnotype() {
		return technotype;
	}

	public void setTechnotype(String technotype) {
		this.technotype = technotype;
	}

	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public String getExecutionenvironment() {
		return executionenvironment;
	}

	public void setExecutionenvironment(String executionenvironment) {
		this.executionenvironment = executionenvironment;
	}

	public Long getMinimumduration() {
		return minimumduration;
	}

	public void setMinimumduration(Long minimumduration) {
		this.minimumduration = minimumduration;
	}

	public Long getAverageduration() {
		return averageduration;
	}

	public void setAverageduration(Long averageduration) {
		this.averageduration = averageduration;
	}

	public Long getMaximumduration() {
		return maximumduration;
	}

	public void setMaximumduration(Long maximumduration) {
		this.maximumduration = maximumduration;
	}

	public Long getNumberofservice() {
		return numberofservice;
	}

	public void setNumberofservice(Long numberofservice) {
		this.numberofservice = numberofservice;
	}

	public Long getNumberoferrors() {
		return numberoferrors;
	}

	public void setNumberoferrors(Long numberoferrors) {
		this.numberoferrors = numberoferrors;
	}

	public Long getNumberofbytes() {
		return numberofbytes;
	}

	public void setNumberofbytes(Long numberofbytes) {
		this.numberofbytes = numberofbytes;
	}

	public Long getNumberbelow100() {
		return numberbelow100;
	}

	public void setNumberbelow100(Long numberbelow100) {
		this.numberbelow100 = numberbelow100;
	}

	public Long getNumberbetween100500() {
		return numberbetween100500;
	}

	public void setNumberbetween100500(Long numberbetween100500) {
		this.numberbetween100500 = numberbetween100500;
	}

	public Long getNumberbetween5001000() {
		return numberbetween5001000;
	}

	public void setNumberbetween5001000(Long numberbetween5001000) {
		this.numberbetween5001000 = numberbetween5001000;
	}

	public Long getNumberbetween10002000() {
		return numberbetween10002000;
	}

	public void setNumberbetween10002000(Long numberbetween10002000) {
		this.numberbetween10002000 = numberbetween10002000;
	}

	public Long getNumberbetween20005000() {
		return numberbetween20005000;
	}

	public void setNumberbetween20005000(Long numberbetween20005000) {
		this.numberbetween20005000 = numberbetween20005000;
	}

	public Long getNumberbetween500010000() {
		return numberbetween500010000;
	}

	public void setNumberbetween500010000(Long numberbetween500010000) {
		this.numberbetween500010000 = numberbetween500010000;
	}

	public Long getNumberbetween1000030000() {
		return numberbetween1000030000;
	}

	public void setNumberbetween1000030000(Long numberbetween1000030000) {
		this.numberbetween1000030000 = numberbetween1000030000;
	}

	public Long getNumberupper30000() {
		return numberupper30000;
	}

	public void setNumberupper30000(Long numberupper30000) {
		this.numberupper30000 = numberupper30000;
	}

}
