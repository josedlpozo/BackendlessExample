package com.josedlpozo.backendless;

import java.util.List;

/**
 * Created by josedelpozo on 17/4/16.
 */
public class BackendlessResponse {

    private String offset;
    private List<Amigo> data;
    private String nextPage;
    private float totalObjects;

    public BackendlessResponse(String offset, List<Amigo> data, String nextPage, float totalObjects) {
        this.offset = offset;
        this.data = data;
        this.nextPage = nextPage;
        this.totalObjects = totalObjects;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public List<Amigo> getData() {
        return data;
    }

    public void setData(List<Amigo> data) {
        this.data = data;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public float getTotalObjects() {
        return totalObjects;
    }

    public void setTotalObjects(float totalObjects) {
        this.totalObjects = totalObjects;
    }
}
