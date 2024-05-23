/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.common.model.reports;

import java.sql.Timestamp;

import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;

public class QualityReportModel {

	private Long SNo;
	private Timestamp dateOfCall;
	private String callerPhoneNumber;
	private String agentID;
	private String agentName;
	private String skillSet;
	private String symptom;
	private String diseaseSummaryProvided;
	private String closureRemark;
	private String callType;
	private String callSubType;
	private String callDuration;
	private String recordingFilePath;

	public QualityReportModel(Long SNo, Timestamp dateOfCall, String callerPhoneNumber,String agentID, String firstName,
			String receivedRoleName, String diseaseSummary, String selecteDiagnosis, String remarks,
			String callTypeName, String callSubTypeName, String callDuration, String recordingFilePath) {
		this.SNo=SNo;
		this.dateOfCall=dateOfCall;
		this.callerPhoneNumber=callerPhoneNumber;
		this.agentID=agentID;
		this.agentName=firstName;
		this.skillSet=receivedRoleName;
		this.symptom=diseaseSummary;
		this.diseaseSummaryProvided=selecteDiagnosis;
		this.closureRemark=remarks;
		this.callType=callTypeName;
		this.callSubType=callSubTypeName;
		this.callDuration=callDuration;
		this.recordingFilePath=recordingFilePath;
	}

	@Override
	public String toString() {

		return new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).serializeNulls()
				.setDateFormat("dd-MM-yyyy HH:mm:ss").create().toJson(this);

	}

	public String getCallerPhoneNumber() {
		return callerPhoneNumber;
	}

	public void setCallerPhoneNumber(String callerPhoneNumber) {
		this.callerPhoneNumber = callerPhoneNumber;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getDiseaseSummaryProvided() {
		return diseaseSummaryProvided;
	}

	public void setDiseaseSummaryProvided(String diseaseSummaryProvided) {
		this.diseaseSummaryProvided = diseaseSummaryProvided;
	}

	public String getClosureRemark() {
		return closureRemark;
	}

	public void setClosureRemark(String closureRemark) {
		this.closureRemark = closureRemark;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getCallSubType() {
		return callSubType;
	}

	public void setCallSubType(String callSubType) {
		this.callSubType = callSubType;
	}

	public String getRecordingFilePath() {
		return recordingFilePath;
	}

	public void setRecordingFilePath(String recordingFilePath) {
		this.recordingFilePath = recordingFilePath;
	}

	public String getCallDuration() {
		return callDuration;
	}

	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}

	public Long getSNo() {
		return SNo;
	}

	public void setSNo(Long sNo) {
		SNo = sNo;
	}

	public Timestamp getDateOfCall() {
		return dateOfCall;
	}

	public void setDateOfCall(Timestamp dateOfCall) {
		this.dateOfCall = dateOfCall;
	}
}