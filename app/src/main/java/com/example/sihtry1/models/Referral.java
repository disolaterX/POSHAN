package com.example.sihtry1.models;

import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.firestore.ServerTimestamp;

import java.io.Serializable;
import java.util.Date;

@IgnoreExtraProperties
public class Referral implements Serializable {
    @ServerTimestamp
    Date date_screened;

    String referral_id;
    String child_first_name;
    String child_last_name;
    String child_gender;
    String child_aadhaar_num;
    int day_of_birth;
    int month_of_birth;
    int year_of_birth;
    String blood_group;
    int asha_measure;
    int height;
    float weight;
    int oedema;

    String guadian_name;
    String guardian_aadhaar_num;

    String nrc_id;
    String rcr_id;

    String other_symptoms;
    String treated_for;

    String phone;
    String village;
    String state;
    String tehsil;
    String district;
    int pincode;

    String status;
    int seen;


    public Referral() {
    }

    public Referral(Date date_screened, String referral_id, String child_first_name,
                    String child_last_name, String child_gender, String child_aadhaar_num,
                    int day_of_birth, int month_of_birth, int year_of_birth, String blood_group,
                    int asha_measure, int height, float weight, int oedema, String guadian_name,
                    String guardian_aadhaar_num, String nrc_id, String rcr_id, String other_symptoms,
                    String treated_for, String phone, String village, String state, String tehsil,
                    String district, int pincode, String status, int seen) {
        this.date_screened = date_screened;
        this.referral_id = referral_id;
        this.child_first_name = child_first_name;
        this.child_last_name = child_last_name;
        this.child_gender = child_gender;
        this.child_aadhaar_num = child_aadhaar_num;
        this.day_of_birth = day_of_birth;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;
        this.blood_group = blood_group;
        this.asha_measure = asha_measure;
        this.height = height;
        this.weight = weight;
        this.oedema = oedema;
        this.guadian_name = guadian_name;
        this.guardian_aadhaar_num = guardian_aadhaar_num;
        this.nrc_id = nrc_id;
        this.rcr_id = rcr_id;
        this.other_symptoms = other_symptoms;
        this.treated_for = treated_for;
        this.phone = phone;
        this.village = village;
        this.state = state;
        this.tehsil = tehsil;
        this.district = district;
        this.pincode = pincode;
        this.status = status;
        this.seen = seen;
    }

    public Date getDate_screened() {
        return date_screened;
    }

    public void setDate_screened(Date date_screened) {
        this.date_screened = date_screened;
    }

    public String getReferral_id() {
        return referral_id;
    }

    public void setReferral_id(String referral_id) {
        this.referral_id = referral_id;
    }

    public String getChild_first_name() {
        return child_first_name;
    }

    public void setChild_first_name(String child_first_name) {
        this.child_first_name = child_first_name;
    }

    public String getChild_last_name() {
        return child_last_name;
    }

    public void setChild_last_name(String child_last_name) {
        this.child_last_name = child_last_name;
    }

    public String getChild_gender() {
        return child_gender;
    }

    public void setChild_gender(String child_gender) {
        this.child_gender = child_gender;
    }

    public String getChild_aadhaar_num() {
        return child_aadhaar_num;
    }

    public void setChild_aadhaar_num(String child_aadhaar_num) {
        this.child_aadhaar_num = child_aadhaar_num;
    }

    public int getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(int day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public void setMonth_of_birth(int month_of_birth) {
        this.month_of_birth = month_of_birth;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public int getAsha_measure() {
        return asha_measure;
    }

    public void setAsha_measure(int asha_measure) {
        this.asha_measure = asha_measure;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getOedema() {
        return oedema;
    }

    public void setOedema(int oedema) {
        this.oedema = oedema;
    }

    public String getGuadian_name() {
        return guadian_name;
    }

    public void setGuadian_name(String guadian_name) {
        this.guadian_name = guadian_name;
    }

    public String getGuardian_aadhaar_num() {
        return guardian_aadhaar_num;
    }

    public void setGuardian_aadhaar_num(String guardian_aadhaar_num) {
        this.guardian_aadhaar_num = guardian_aadhaar_num;
    }

    public String getNrc_id() {
        return nrc_id;
    }

    public void setNrc_id(String nrc_id) {
        this.nrc_id = nrc_id;
    }

    public String getRcr_id() {
        return rcr_id;
    }

    public void setRcr_id(String rcr_id) {
        this.rcr_id = rcr_id;
    }

    public String getOther_symptoms() {
        return other_symptoms;
    }

    public void setOther_symptoms(String other_symptoms) {
        this.other_symptoms = other_symptoms;
    }

    public String getTreated_for() {
        return treated_for;
    }

    public void setTreated_for(String treated_for) {
        this.treated_for = treated_for;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSeen() {
        return seen;
    }

    public void setSeen(int seen) {
        this.seen = seen;
    }
}
