package com.chucuaz.authorizer;

import java.util.LinkedList;
import org.json.JSONObject;

public class Authorizer {
    private LinkedList<String> outputList = new LinkedList<>();
    private LinkedList<JSONObject> inputList;

    public Authorizer(LinkedList<JSONObject> input) {
        inputList = input;
    }

    public Authorizer execute() {

        return this;
    }

    public LinkedList<?> getList() {

        return outputList;
    }
    
    public final static class Builder {
        private LinkedList<JSONObject> input = new LinkedList<>();

        public static Builder anAuthorizer() {
            return new Builder();
        }

        public Builder withInput(String job) {
            input.add(new JSONObject(job));

            return this;
        }

        public Authorizer Build() {
            return new Authorizer(input);
        }
    }
}
