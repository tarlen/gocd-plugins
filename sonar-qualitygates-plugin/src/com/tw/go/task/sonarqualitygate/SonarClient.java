package com.tw.go.task.sonarqualitygate;

import java.security.GeneralSecurityException;

import org.json.JSONObject;

import com.tw.go.plugin.common.ApiRequestBase;


/**
 * Created by MarkusW on 20.10.2015.
 */
public class SonarClient extends ApiRequestBase {

    public SonarClient(String apiUrl) throws GeneralSecurityException
    {
        super(apiUrl, "", "", true);
    }

    public JSONObject getProjectWithQualityGateDetails(String projectKey) throws Exception
    {
        String uri = getApiUrl() + "/qualitygates/project_status?projectKey=%1$s";
        uri = String.format(uri, projectKey);
        String resultData = requestGet(uri);

//        SonarTaskExecutor.getLogger().printLine("API Result: " + resultData);
        
        JSONObject jsonObject = new JSONObject(resultData);

        return jsonObject;
    }
}
