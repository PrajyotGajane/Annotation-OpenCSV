package com.bridgelabz.com.OpenCSV;
import com.opencsv.bean.CsvBindByName;

class CSVUser {
      @CsvBindByName
      private String name;

      @CsvBindByName(column = "email", required = true)
      private String email;

      @CsvBindByName(column = "phone")
      private String phoneNo;

      @CsvBindByName
      private String country;

      public CSVUser(String s, String s1, String s2, String india) {
            this.name = s;
            this.email = s1;
            this.phoneNo = s2;
            this.country = india;
      }

      public String getName() {
            return this.name;
      }

      public String getEmail() {
            return this.email;
      }

      public String getPhoneNo() {
            return this.phoneNo;
      }

      public String getCountry() {
            return this.country;
      }
      public String toString(){
            return this.name+" "+this.email+" "+this.phoneNo+" "+this.country;
      }
      // Getters and Setters (Omitted for brevity)
}
