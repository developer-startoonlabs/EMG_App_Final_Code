package com.startemg.apps.pheezee.pojos;

public class SceduledSessionNotSaved {
    String phizioemail, patientid;

    public SceduledSessionNotSaved(String phizioemail, String patientid) {
        this.phizioemail = phizioemail;
        this.patientid = patientid;
    }

    public String getPhizioemail() {
        return phizioemail;
    }

    public void setPhizioemail(String phizioemail) {
        this.phizioemail = phizioemail;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }
}
