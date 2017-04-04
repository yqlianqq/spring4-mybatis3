package me.gacl.domain;

public class Attachment {
    private Integer id;

    private Integer attId;

    private String attSrc;

    private Integer excChaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    public String getAttSrc() {
        return attSrc;
    }

    public void setAttSrc(String attSrc) {
        this.attSrc = attSrc == null ? null : attSrc.trim();
    }

    public Integer getExcChaId() {
        return excChaId;
    }

    public void setExcChaId(Integer excChaId) {
        this.excChaId = excChaId;
    }
}