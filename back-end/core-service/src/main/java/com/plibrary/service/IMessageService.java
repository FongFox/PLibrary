package com.plibrary.service;

import com.plibrary.dto.AdminQuestionRequest;
import com.plibrary.entity.Message;

public interface IMessageService {
    public void postMessage(Message messageRequest, String userEmail);
    public void putMessage(AdminQuestionRequest adminQuestionRequest, String userEmail) throws Exception;
}
