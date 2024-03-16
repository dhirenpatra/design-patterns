package com.dhiren.patterns.builder;

public class HttpClient {

    private final String httpMethod;
    private final String url;
    private final String username;
    private final String password;
    private final String header;
    private final String body;

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.httpMethod = httpClientBuilder.httpMethod;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.username;
        this.password = httpClientBuilder.password;
        this.header = httpClientBuilder.header;
        this.body = httpClientBuilder.body;
    }

    public static class HttpClientBuilder {
        private String httpMethod;
        private String url;
        private String username;
        private String password;
        private String header;
        private String body;

        public HttpClientBuilder httpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder auth(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public HttpClientBuilder header(String header) {
            this.header = header;
            return this;
        }

        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "httpMethod='" + httpMethod + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

}
