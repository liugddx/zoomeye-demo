
package com.liugdxd.zoomeye.es.bo;

import java.util.HashMap;
import java.util.Map;

public class Subdivisions {

    private Object code;
    private Names__3 names;
    private Object geonameId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Names__3 getNames() {
        return names;
    }

    public void setNames(Names__3 names) {
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
        sb.append(Subdivisions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
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
        if ((other instanceof Subdivisions) == false) {
            return false;
        }
        Subdivisions rhs = ((Subdivisions) other);
        return (((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.geonameId == rhs.geonameId)||((this.geonameId!= null)&&this.geonameId.equals(rhs.geonameId))));
    }

}
