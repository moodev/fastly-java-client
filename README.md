# fastly-java-client
JAVA client for the FASTLY API (https://docs.fastly.com/api/)

### Requirements

Java 8

### Using with Maven

TODO: publish to public repository....
Add this dependency to your project's POM:

    <dependency>
        <groupId>com.moo.cdn</groupId>
        <artifactId>fastly-java-client</artifactId>
        <version>VERSION</version>
    </dependency>

### Usage

#### Creating a client

    See http://square.github.io/retrofit/.

    e.g.
    Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FastlyApi.FASTLY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    FastlyApi api = retrofit.create(FastlyApi.class);
