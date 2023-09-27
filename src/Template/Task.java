package Template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    public void excecute(){
        auditTrail.record();
        doExecute();
    }
    // protected so can't be called in main and ignoring the auditTrail
    protected abstract void doExecute();

}
