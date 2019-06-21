package com.instant.tio.packet;

import com.instant.tio.inter.MsgType;

/**
 *在线状态
 * */
public class LayimToClientOnlineStatusMsgBody extends LayimBaseBody {

    private static final String ONLINE = "online";
    private static final String OFFLINE = "offline";
    @Override
    public byte getMtype() {
        return MsgType.CLIENT_ONLINE_STATUS;
    }

    @Override
    public void setMtype(byte mtype) {

    }

    public LayimToClientOnlineStatusMsgBody(long userId,boolean online){
        this.id = userId;
        this.status = online ? ONLINE : OFFLINE;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String status;
    private long id;
}
