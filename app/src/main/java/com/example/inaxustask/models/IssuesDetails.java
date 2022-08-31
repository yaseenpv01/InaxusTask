package com.example.inaxustask.models;

public class IssuesDetails {

    Integer FilterType;
    Integer OrganizationID;
    Integer ProjectID;
    Integer PageSize,OrganizationUserID,PageNumber;
    String DatabaseName;

    public Integer getFilterType() {
        return FilterType;
    }

    public void setFilterType(Integer filterType) {
        FilterType = filterType;
    }

    public Integer getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(Integer organizationID) {
        OrganizationID = organizationID;
    }

    public Integer getProjectID() {
        return ProjectID;
    }

    public void setProjectID(Integer projectID) {
        ProjectID = projectID;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getOrganizationUserID() {
        return OrganizationUserID;
    }

    public void setOrganizationUserID(Integer organizationUserID) {
        OrganizationUserID = organizationUserID;
    }

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        PageNumber = pageNumber;
    }

    public String getDatabaseName() {
        return DatabaseName;
    }

    public void setDatabaseName(String databaseName) {
        DatabaseName = databaseName;
    }
}
