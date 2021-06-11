# FDK Java


FDK client for Java language


## Getting Started
Get started with the Java Development SDK for Fynd Platform


# Usage

1. Add the dependency in your app pom.xml `'com.github.gofynd:fynd-client-java:1.0-SNAPSHOT'` in your app pom.xml
2. Add it in your root pom.xml at the end of repositories:
   ```
   <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    ```
3. Start integrating

### Sample Usage - ApplicationClient

```java
    ApplicationConfig applicationConfig = null;
    try {
          applicationConfig = new ApplicationConfig(
              "YOUR_APPLICATION_ID",
              "YOUR_APPLICATION_TOKEN"
              );
        if(Objects.nonNull(applicationConfig)) {
            ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
            return applicationClient.catalog.getProductDetailBySlug("product-slug");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```

### Sample Usage - PlatformClient

```java
    PlatformConfig platformConfig = null;
    try {
          platformConfig = new PlatformConfig(
          "COMPANY_ID",
          "API_KEY",
          "API_SECRET",
          "DOMAIN"
          );
        if(Objects.nonNull(platformConfig)) {
            PlatformClient platformClient = new PlatformClient(platformConfig);
            return platformClient.catalog.getCompanyDetail("COMPANY_ID");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```


### Documentation

* [Application Front](documentation/APPLICATION.md)
* [Platform Front](documentation/PLATFORM.md)
