
package com.liugdxd.zoomeye.es.bo;

import java.util.HashMap;
import java.util.Map;

public class Protocol {

    private String application;
    private String transport;
    private String probe;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getProbe() {
        return probe;
    }

    public void setProbe(String probe) {
        this.probe = probe;
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
        sb.append(Protocol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("application");
        sb.append('=');
        sb.append(((this.application == null)?"<null>":this.application));
        sb.append(',');
        sb.append("transport");
        sb.append('=');
        sb.append(((this.transport == null)?"<null>":this.transport));
        sb.append(',');
        sb.append("probe");
        sb.append('=');
        sb.append(((this.probe == null)?"<null>":this.probe));
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
        result = ((result* 31)+((this.transport == null)? 0 :this.transport.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.probe == null)? 0 :this.probe.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Protocol) == false) {
            return false;
        }
        Protocol rhs = ((Protocol) other);
        return (((((this.transport == rhs.transport)||((this.transport!= null)&&this.transport.equals(rhs.transport)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.probe == rhs.probe)||((this.probe!= null)&&this.probe.equals(rhs.probe))));
    }

}
