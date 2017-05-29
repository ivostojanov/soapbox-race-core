package com.soapboxrace.core.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
@NamedQueries({ //
	@NamedQuery(name = "CategoryEntity.findByCategoryName", query = "SELECT obj FROM CategoryEntity obj") //
})
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategory", nullable = false)
	private long idcategory;
	
	private String catalogVersion;
	private String categories;
	private String displayName;
	private Integer filterType;
	private String icon;
	private Long id;
	private String longDescription;
	private String name;
	private Short priority;
	
	@OneToMany(mappedBy = "category", targetEntity = VinylProductEntity.class)
	private List<VinylProductEntity> listOfVinyls;
	
	private String shortDescription;
	private Boolean showInNavigationPane;
	private Boolean showPromoPage;
	private String webIcon;

	public Long getId() {
		return idcategory;
	}
	public void setId(Long id) {
		this.idcategory = id;		
	}

	public String getCatalogVersion() {
		return catalogVersion;
	}
	public void setCatalogVersion(String catalogVersion) {
		this.catalogVersion = catalogVersion;
	}

	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getFilterType() {
		return filterType;
	}
	public void setFilterType(Integer filterType) {
		this.filterType = filterType;
	}

	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Short getPriority() {
		return priority;
	}
	public void setPriority(Short priority) {
		this.priority = priority;
	}

	public List<VinylProductEntity> getListOfVinyls() {
		return listOfVinyls;
	}
	public void setListOfVinyls(List<VinylProductEntity> listOfVinyls) {
		this.listOfVinyls = listOfVinyls;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public Boolean getShowInNavigationPane() {
		return showInNavigationPane;
	}
	public void setShowInNavigationPane(Boolean showInNavigationPane) {
		this.showInNavigationPane = showInNavigationPane;
	}

	public Boolean getShowPromoPage() {
		return showPromoPage;
	}
	public void setShowPromoPage(Boolean showPromoPage) {
		this.showPromoPage = showPromoPage;
	}

	public String getWebIcon() {
		return webIcon;
	}
	public void setWebIcon(String webIcon) {
		this.webIcon = webIcon;
	}
}