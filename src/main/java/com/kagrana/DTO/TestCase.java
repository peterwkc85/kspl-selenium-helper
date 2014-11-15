package com.kagrana.DTO;

import java.util.ArrayList;
import java.util.List;

public class TestCase
{
  private String TestCaseName;
  private boolean TestCaseStatus;
  private String TestCaseId;
  private String TestCaseDescription;
  private String Browser;
  private String ParentURL;
  private List<TestStep> TestSteps;
  
  public TestCase(){
	  this.TestCaseName = "";
	  this.TestCaseStatus = true;
	  this.TestCaseId = "";
	  this.TestCaseDescription = "";
	  this.Browser = "";
	  this.ParentURL = "";
	  this.TestSteps = new ArrayList<TestStep>();
  }
  public final String getTestCaseName()
  {
    return this.TestCaseName;
  }
  
  public final void setTestCaseName(String value)
  {
    this.TestCaseName = value;
  }
  
  public final boolean getTestCaseStatus()
  {
    return this.TestCaseStatus;
  }
  
  public final void setTestCaseStatus(boolean value)
  {
    this.TestCaseStatus = value;
  }
  
  public final String getTestCaseId()
  {
    return this.TestCaseId;
  }
  
  public final void setTestCaseId(String value)
  {
    this.TestCaseId = value;
  }
  
  public final String getTestCaseDescription()
  {
    return this.TestCaseDescription;
  }
  
  public final void setTestCaseDescription(String value)
  {
    this.TestCaseDescription = value;
  }
  
  public final String getParentURL()
  {
    return this.ParentURL;
  }
  
  public final void setParentURL(String value)
  {
    this.ParentURL = value;
  }
  
  public final List<TestStep> getTestSteps()
  {
    return this.TestSteps;
  }
  
  public final void addTestSteps(TestStep testStep)
  {
    this.TestSteps.add(testStep);
  }
  
  public String getBrowser()
  {
    return this.Browser;
  }
  
  public void setBrowser(String browserName)
  {
    this.Browser = browserName;
  }
}
