package classes;

import interfaces.IFeedback;

public class Feedback implements IFeedback{
	private String username;
	private int tripID;
	public Feedback(String username, int tripID, String feedbackID, String feedback) {
		super();
		this.username = username;
		this.tripID = tripID;
		this.feedbackID = feedbackID;
		this.feedback = feedback;
	}
	public Feedback()
	{
		
		
	}
	
	private String feedbackID;
	private String feedback;
	
	public void addFeedback() {
		
	}
	public void showFeedback() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTripID() {
		return tripID;
	}
	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	public String getFeedbackID() {
		return feedbackID;
	}
	public void setFeedbackID(String feedbackID) {
		this.feedbackID = feedbackID;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
