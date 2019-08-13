
package com.liugdxd.zoomeye.es.bo;

import java.util.HashMap;
import java.util.Map;

public class Geoinfo {

    private Continent continent;
    private Country country;
    private String poweredBy;
    private String baseStation;
    private City city;
    private String isp;
    private Object organizationCN;
    private String idc;
    private Object organization;
    private Location location;
    private Object aso;
    private String asn;
    private Subdivisions subdivisions;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPoweredBy() {
        return poweredBy;
    }

    public void setPoweredBy(String poweredBy) {
        this.poweredBy = poweredBy;
    }

    public String getBaseStation() {
        return baseStation;
    }

    public void setBaseStation(String baseStation) {
        this.baseStation = baseStation;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public Object getOrganizationCN() {
        return organizationCN;
    }

    public void setOrganizationCN(Object organizationCN) {
        this.organizationCN = organizationCN;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public Object getOrganization() {
        return organization;
    }

    public void setOrganization(Object organization) {
        this.organization = organization;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Object getAso() {
        return aso;
    }

    public void setAso(Object aso) {
        this.aso = aso;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public Subdivisions getSubdivisions() {
        return subdivisions;
    }

    public void setSubdivisions(Subdivisions subdivisions) {
        this.subdivisions = subdivisions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Geoinfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("continent");
        sb.append('=');
        sb.append(((this.continent == null)?"<null>":this.continent));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("poweredBy");
        sb.append('=');
        sb.append(((this.poweredBy == null)?"<null>":this.poweredBy));
        sb.append(',');
        sb.append("baseStation");
        sb.append('=');
        sb.append(((this.baseStation == null)?"<null>":this.baseStation));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("isp");
        sb.append('=');
        sb.append(((this.isp == null)?"<null>":this.isp));
        sb.append(',');
        sb.append("organizationCN");
        sb.append('=');
        sb.append(((this.organizationCN == null)?"<null>":this.organizationCN));
        sb.append(',');
        sb.append("idc");
        sb.append('=');
        sb.append(((this.idc == null)?"<null>":this.idc));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("aso");
        sb.append('=');
        sb.append(((this.aso == null)?"<null>":this.aso));
        sb.append(',');
        sb.append("asn");
        sb.append('=');
        sb.append(((this.asn == null)?"<null>":this.asn));
        sb.append(',');
        sb.append("subdivisions");
        sb.append('=');
        sb.append(((this.subdivisions == null)?"<null>":this.subdivisions));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.continent == null)? 0 :this.continent.hashCode()));
        result = ((result* 31)+((this.organizationCN == null)? 0 :this.organizationCN.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.isp == null)? 0 :this.isp.hashCode()));
        result = ((result* 31)+((this.idc == null)? 0 :this.idc.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.baseStation == null)? 0 :this.baseStation.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.poweredBy == null)? 0 :this.poweredBy.hashCode()));
        result = ((result* 31)+((this.aso == null)? 0 :this.aso.hashCode()));
        result = ((result* 31)+((this.asn == null)? 0 :this.asn.hashCode()));
        result = ((result* 31)+((this.subdivisions == null)? 0 :this.subdivisions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geoinfo) == false) {
            return false;
        }
        Geoinfo rhs = ((Geoinfo) other);
        return (((((((((((((((this.continent == rhs.continent)||((this.continent!= null)&&this.continent.equals(rhs.continent)))&&((this.organizationCN == rhs.organizationCN)||((this.organizationCN!= null)&&this.organizationCN.equals(rhs.organizationCN))))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.isp == rhs.isp)||((this.isp!= null)&&this.isp.equals(rhs.isp))))&&((this.idc == rhs.idc)||((this.idc!= null)&&this.idc.equals(rhs.idc))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.baseStation == rhs.baseStation)||((this.baseStation!= null)&&this.baseStation.equals(rhs.baseStation))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.poweredBy == rhs.poweredBy)||((this.poweredBy!= null)&&this.poweredBy.equals(rhs.poweredBy))))&&((this.aso == rhs.aso)||((this.aso!= null)&&this.aso.equals(rhs.aso))))&&((this.asn == rhs.asn)||((this.asn!= null)&&this.asn.equals(rhs.asn))))&&((this.subdivisions == rhs.subdivisions)||((this.subdivisions!= null)&&this.subdivisions.equals(rhs.subdivisions))));
    }

}
