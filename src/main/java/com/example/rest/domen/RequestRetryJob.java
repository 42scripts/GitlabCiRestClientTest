package com.example.rest.domen;

public class RequestRetryJob extends Pipeline{
    String before_sha;
    String tag;
    User user;
    String create_at;
    String update_at;
    String finished_at;
    String commited_at;
    String duration;
    String coverage;
    String web_url;

    public String getBefore_sha() {
        return before_sha;
    }

    public void setBefore_sha(String before_sha) {
        this.before_sha = before_sha;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getFinished_at() {
        return finished_at;
    }

    public void setFinished_at(String finished_at) {
        this.finished_at = finished_at;
    }

    public String getCommited_at() {
        return commited_at;
    }

    public void setCommited_at(String commited_at) {
        this.commited_at = commited_at;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }
}
