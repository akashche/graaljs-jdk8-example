/*
 * Copyright 2018, akashche at redhat.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.redhat.akashche.GraalJSLauncher;
import org.junit.Test;

import java.io.File;
import java.net.URI;

public class SunSpiderTest {

    @Test
    public void test() {
        File testJarDir = codeSourceDir(SunSpiderTest.class);
        File projectDir = testJarDir.getParentFile().getParentFile();
        File sunSpiderDir = new File(projectDir, "src/test/js/sunspider-0.9.1");
        File sunSpiderRunner = new File(sunSpiderDir, "run.js");
        System.out.println("Running SunSpider benchmark warmup, it may take a couple of minutes ...");
        GraalJSLauncher.main(new String[]{sunSpiderRunner.getAbsolutePath(), "--", sunSpiderDir.getAbsolutePath()});
        System.out.println("\n\nRunning SunSpider benchmark, it may take a couple of minutes ...");
        GraalJSLauncher.main(new String[]{sunSpiderRunner.getAbsolutePath(), "--", sunSpiderDir.getAbsolutePath()});
    }

    private static File codeSourceDir(Class<?> clazz) {
        try {
            URI uri = clazz.getProtectionDomain().getCodeSource().getLocation().toURI();
            File jarOrDir = new File(uri);
            return jarOrDir.isDirectory() ? jarOrDir : jarOrDir.getParentFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
