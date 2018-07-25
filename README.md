GraalJS example on OpenJDK8 with JVMCI
======================================

Example of running [SunSpider JavaScript benchmark](https://github.com/mozilla/rhino/tree/master/testsrc/benchmarks/sunspider-0.9.1)
with GraalJS.

Must be run using OpenJDK 8 with [JVMCI](http://openjdk.java.net/jeps/243),
see [CI builds for Linux and Windows](https://github.com/ojdkbuild/contrib_graal-jvmci-8-ci):

    git clone https://github.com/akashche/graaljs-jdk8-example.git
    cd graaljs-jdk8-example
    mvn test

Expected output:

    ...
    Running SunSpider benchmark, it may take a couple of minutes ...
    ============================================
    RESULTS (means and 95% confidence intervals)
    --------------------------------------------
    Total:                  7274.6ms +-  8.3%
    --------------------------------------------
      3d:                    850.4ms +-  5.6%
        cube:                207.7ms +- 14.6%
        morph:               279.1ms +-  9.8%
        raytrace:            363.6ms +- 11.6%
      access:               1058.3ms +- 20.2%
        binary-trees:        140.7ms +- 14.8%
        fannkuch:            602.7ms +- 16.6%
        nbody:               171.9ms +- 111.2%
        nsieve:              143.0ms +- 20.4%
      bitops:                877.4ms +- 12.8%
        3bit-bits-in-byte:    73.3ms +- 40.1%
        bits-in-byte:        156.7ms +- 15.1%
        bitwise-and:         365.6ms +- 24.5%
        nsieve-bits:         281.9ms +-  9.5%
      controlflow:           377.0ms +- 26.0%
        recursive:           377.0ms +- 26.0%
      crypto:                564.7ms +- 14.7%
        aes:                 310.0ms +- 13.7%
        md5:                 127.6ms +- 27.1%
        sha1:                127.1ms +- 22.3%
      date:                  539.9ms +- 17.0%
        format-tofte:        357.0ms +- 29.4%
        format-xparb:        182.9ms +- 15.0%
      math:                  603.0ms +- 17.5%
        cordic:              205.4ms +- 13.2%
        partial-sums:        243.3ms +- 25.1%
        spectral-norm:       154.3ms +- 23.7%
      regexp:                327.9ms +- 23.5%
        dna:                 327.9ms +- 23.5%
      string:               2076.0ms +- 21.1%
        base64:              114.0ms +- 18.3%
        fasta:               477.7ms +-  9.4%
        tagcloud:            180.9ms +- 82.4%
        unpack-code:        1174.0ms +- 22.8%
        validate-input:      129.4ms +- 20.2%
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 508.67 sec

License information
-------------------

This project is released under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).

