package com.manage.util;

import com.alibaba.fastjson.JSONObject;
public class JsonResult {
    JSONObject resultJson;
    String msg;
    int status;
    JSONObject data;

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public JSONObject getResultJson() {
        return resultJson;
    }

    public void setResultJson(JSONObject resultJson) {
        this.resultJson = resultJson;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public JSONObject getJsonResult(){
        resultJson = new JSONObject();
        resultJson.put("status",status);
        resultJson.put("msg",msg);
        resultJson.put("data",data);
        return resultJson;
    }
}
