
package com.liugdxd.zoomeye.es.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoomeyeData {

    private Integer total;
    private Integer available;
    private List<Match> matches = new ArrayList<Match>();
    private Facets facets;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
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
        sb.append(ZoomeyeData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("available");
        sb.append('=');
        sb.append(((this.available == null)?"<null>":this.available));
        sb.append(',');
        sb.append("matches");
        sb.append('=');
        sb.append(((this.matches == null)?"<null>":this.matches));
        sb.append(',');
        sb.append("facets");
        sb.append('=');
        sb.append(((this.facets == null)?"<null>":this.facets));
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
        result = ((result* 31)+((this.available == null)? 0 :this.available.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.matches == null)? 0 :this.matches.hashCode()));
        result = ((result* 31)+((this.facets == null)? 0 :this.facets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ZoomeyeData) == false) {
            return false;
        }
        ZoomeyeData rhs = ((ZoomeyeData) other);
        return ((((((this.available == rhs.available)||((this.available!= null)&&this.available.equals(rhs.available)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.matches == rhs.matches)||((this.matches!= null)&&this.matches.equals(rhs.matches))))&&((this.facets == rhs.facets)||((this.facets!= null)&&this.facets.equals(rhs.facets))));
    }

}
