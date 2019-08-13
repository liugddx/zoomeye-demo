
package com.liugdxd.zoomeye.es.bo;

import java.util.HashMap;
import java.util.Map;

public class Names__3 {

    private String en;
    private String zhCN;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getZhCN() {
        return zhCN;
    }

    public void setZhCN(String zhCN) {
        this.zhCN = zhCN;
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
        sb.append(Names__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("en");
        sb.append('=');
        sb.append(((this.en == null)?"<null>":this.en));
        sb.append(',');
        sb.append("zhCN");
        sb.append('=');
        sb.append(((this.zhCN == null)?"<null>":this.zhCN));
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
        result = ((result* 31)+((this.zhCN == null)? 0 :this.zhCN.hashCode()));
        result = ((result* 31)+((this.en == null)? 0 :this.en.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Names__3) == false) {
            return false;
        }
        Names__3 rhs = ((Names__3) other);
        return ((((this.zhCN == rhs.zhCN)||((this.zhCN!= null)&&this.zhCN.equals(rhs.zhCN)))&&((this.en == rhs.en)||((this.en!= null)&&this.en.equals(rhs.en))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
