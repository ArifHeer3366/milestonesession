package com.milestonesession.milestonesession;

import java.util.Objects;

public class info {
    private String git;
    private String session;

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        info info = (info) o;
        return Objects.equals(git, info.git) &&
                Objects.equals(session, info.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(git, session);
    }
}
