package com.moo.cdn.model;

import java.util.List;

/**
 * The result of an action, such as deleting or validating a resource.
 * It contains the status and a list of errors and warnings related to the action
 *
 * https://docs.fastly.com/api/config
 */
public class ActionResult {

    private Status status;

    private List<String> warnings;

    private List<String> errors;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
