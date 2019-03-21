package myTest.testDrools;

/**
 * Hello world!
 *
 */
public class CCASchema {
	
	private String PatientName;
	
	private int PatientAge;
	
	private String PatientID;
	
	private Enum Classes;
	
	private String STROKE_SUSPECTED;
	
	private boolean IsDischarged;
	
	public CCASchema() {
		
	}
	
	public String getPatientName() {
		return this.PatientName;
	}
	
	public void setPatientName(String PatientName) {
		this.PatientName = PatientName;
	}
	
	public String getPatientID() {
		return this.PatientID;
	}
	
	public void setPatientID(String PatientID) {
		this.PatientID = PatientID;
	}
	
	public Enum getClasses() {
		return this.Classes;
	}
	
	public void setClasses(Enum classes) {
		this.Classes = classes;
	}
	
	public String getSTROKE_SUSPECTED() {
		return this.STROKE_SUSPECTED;
	}
	
	public void setSTROKE_SUSPECTED(String STROKE_SUSPECTED) {
		this.STROKE_SUSPECTED = STROKE_SUSPECTED;
	}
	
	public boolean getIsDischarged() {
		return this.IsDischarged;
	}
	
	public void setisDischarged(boolean isDischarged) {
		this.IsDischarged = isDischarged;
	}
	
	public int PatientAge() {
		return this.PatientAge;
	}
	
	public void setPatientAge(int PatientAge) {
		this.PatientAge = PatientAge;
	}
	
	public CCASchema(String PatientName, int PatientAge, String PatientID, Enum classes, String STROKE_SUSPECTED, boolean isDischarged) {
		this.PatientName = PatientName;
		this.PatientAge = PatientAge;
		this.PatientID = PatientID;
		this.Classes = classes;
		this.STROKE_SUSPECTED = STROKE_SUSPECTED;
		this.IsDischarged = isDischarged;
	}
	
}
