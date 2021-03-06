package com.makotojava.learn;

/*
 * Copyright 2016 Makoto Consulting Group, Inc.
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
 *
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Interface that describes a contract to read an InputStream
 * into a List<String>, and write a List<String> to an OutputStream.
 * 
 * @author sperry
 *
 */
public interface StreamProcessor {

  /**
   * Read an InputStream into a List<String>. The InputStream is assumed
   * to contain UTF-8 characters for the purposes of this example.
   * 
   * @param inputStream
   *          The InputStream to be read, and its contents to be
   *          formatted into a List<String>.
   * 
   * @return List<String> - the List of Strings representing the lines of
   *         data in the InputStream.
   */
  public List<String> readIntoLines(InputStream inputStream);

  /**
   * Write a List<String> to the specified OutputStream.
   * 
   * @param lines
   *          The List of Strings to write to the OutputStream.
   * 
   * @param outputStream
   *          The OutputStream to which the List<String>
   *          is to be written.
   */
  public void writeLines(List<String> lines, OutputStream outputStream);

  /**
   * Copies the data from the specified InputStream to the specified
   * OutputStream. For this example, we will assume the data is UTF-8
   * encoded (though it really shouldn't matter, it's just easier to
   * look at the files when the runs have completed).
   * 
   * @param inputStream
   *          The InputStream to be copied.
   * 
   * @param outputStream
   *          The OutputStream where the data from the InputStream is to be copied.
   */
  public void copy(InputStream inputStream, OutputStream outputStream);

}
