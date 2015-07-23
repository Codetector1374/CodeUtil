package cn.codetector.util.IO.Net.Web;

import java.net.URI;
import java.net.URISyntaxException;

public class URIBuilder {
    private String uri;

    public URIBuilder(String URI) {
        this.uri = URI;
    }

    public URIBuilder append(String para){
        this.uri = this.uri + para;
        return this;
    }

    public URIBuilder appendArg(String arg){
        if(!this.uri.endsWith("/")) {
            this.uri = this.uri + "/";
        }
        this.uri = this.uri + arg + "/";
        return this;
    }

    @Override
    public String toString(){
        return this.uri;
    }

    public URI toURI(){
        try {
            return new URI(this.uri);
        } catch (URISyntaxException e) {
        }
        return null;
    }
}
