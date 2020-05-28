package com.mysite.core.models;
 
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
 
@Model(adaptables = Resource.class, resourceType = "mysite/components/customtitle")
public class CustomTitleModel {
    
    @Inject
    @Optional
    private String text;
    
    @Inject
    @Optional
    private String heading;
 
    @Inject
    @Optional
    private String alignment;
 
    @Inject
    @Optional
    private String margin;
 
    public String getText() {
        return this.text;
    }
 
    public String getHeading() {
        return this.heading;
    }
 
    public String getAlignment() {
        return this.alignment;
    }
 
    public String getMargin() {
        return this.margin;
    }
 
    @PostConstruct
    protected void init(){
        if(text == "" || text == null ) {
            text = "";
        }
    }
 
}