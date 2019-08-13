
package com.liugdxd.zoomeye.es.bo;

import java.util.HashMap;
import java.util.Map;

public class Match {

    private Protocol protocol;
    private String rdns;
    private String ip;
    private Geoinfo geoinfo;
    private Portinfo portinfo;
    private String timestamp;
    private String honeypotLastupdate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public String getRdns() {
        return rdns;
    }

    public void setRdns(String rdns) {
        this.rdns = rdns;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Geoinfo getGeoinfo() {
        return geoinfo;
    }

    public void setGeoinfo(Geoinfo geoinfo) {
        this.geoinfo = geoinfo;
    }

    public Portinfo getPortinfo() {
        return portinfo;
    }

    public void setPortinfo(Portinfo portinfo) {
        this.portinfo = portinfo;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHoneypotLastupdate() {
        return honeypotLastupdate;
    }

    public void setHoneypotLastupdate(String honeypotLastupdate) {
        this.honeypotLastupdate = honeypotLastupdate;
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
        sb.append(Match.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
        sb.append(',');
        sb.append("rdns");
        sb.append('=');
        sb.append(((this.rdns == null)?"<null>":this.rdns));
        sb.append(',');
        sb.append("ip");
        sb.append('=');
        sb.append(((this.ip == null)?"<null>":this.ip));
        sb.append(',');
        sb.append("geoinfo");
        sb.append('=');
        sb.append(((this.geoinfo == null)?"<null>":this.geoinfo));
        sb.append(',');
        sb.append("portinfo");
        sb.append('=');
        sb.append(((this.portinfo == null)?"<null>":this.portinfo));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("honeypotLastupdate");
        sb.append('=');
        sb.append(((this.honeypotLastupdate == null)?"<null>":this.honeypotLastupdate));
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
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        result = ((result* 31)+((this.rdns == null)? 0 :this.rdns.hashCode()));
        result = ((result* 31)+((this.ip == null)? 0 :this.ip.hashCode()));
        result = ((result* 31)+((this.geoinfo == null)? 0 :this.geoinfo.hashCode()));
        result = ((result* 31)+((this.honeypotLastupdate == null)? 0 :this.honeypotLastupdate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.portinfo == null)? 0 :this.portinfo.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Match) == false) {
            return false;
        }
        Match rhs = ((Match) other);
        return (((((((((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol)))&&((this.rdns == rhs.rdns)||((this.rdns!= null)&&this.rdns.equals(rhs.rdns))))&&((this.ip == rhs.ip)||((this.ip!= null)&&this.ip.equals(rhs.ip))))&&((this.geoinfo == rhs.geoinfo)||((this.geoinfo!= null)&&this.geoinfo.equals(rhs.geoinfo))))&&((this.honeypotLastupdate == rhs.honeypotLastupdate)||((this.honeypotLastupdate!= null)&&this.honeypotLastupdate.equals(rhs.honeypotLastupdate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.portinfo == rhs.portinfo)||((this.portinfo!= null)&&this.portinfo.equals(rhs.portinfo))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
