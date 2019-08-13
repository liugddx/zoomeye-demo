
package com.liugdxd.zoomeye.es.bo;

import java.util.HashMap;
import java.util.Map;

public class City {

    private Names__2 names;
    private Object geonameId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Names__2 getNames() {
        return names;
    }

    public void setNames(Names__2 names) {
        this.names = names;
    }

    public Object getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Object geonameId) {
        this.geonameId = geonameId;
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
        sb.append(City.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("geonameId");
        sb.append('=');
        sb.append(((this.geonameId == null)?"<null>":this.geonameId));
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
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.geonameId == null)? 0 :this.geonameId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof City) == false) {
            return false;
        }
        City rhs = ((City) other);
        return ((((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.geonameId == rhs.geonameId)||((this.geonameId!= null)&&this.geonameId.equals(rhs.geonameId))));
    }

}
