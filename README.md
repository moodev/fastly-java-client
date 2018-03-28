# fastly-java-client
JAVA client for the FASTLY API (https://docs.fastly.com/api/)

### Requirements

Java 8

### Using with Maven

Build and publish to your local repository. (I have not yet published publically to the public Nexus Repository)

Then add this dependency to your project's POM:

    <dependency>
        <groupId>com.moo.cdn</groupId>
        <artifactId>fastly-java-client</artifactId>
        <version>VERSION</version>
    </dependency>

### Usage

#### Creating a client

    See http://square.github.io/retrofit/.

    OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
            clientBuilder.networkInterceptors().add(chain -> {
                Request request = chain.request()
                    .newBuilder()
                    .addHeader(FastlyApi.FASTLY_AUTH_HEADER, apiKey)
                    .build();
                return chain.proceed(request);
            });

    
    Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FastlyApi.FASTLY_URL)
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    FastlyApi api = retrofit.create(FastlyApi.class);
