/* LanguageTool, a natural language style checker
 * Copyright (C) 2013 Daniel Naber (http://www.danielnaber.de)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.dev.dumpcheck;

/**
 * A single sentence to be indexed/checked.
 * @since 2.4
 */
class Sentence {

  private final String sentence;
  private final String source;
  private final String title;
  private final String url;

  Sentence(String sentence, String source, String title, String url) {
    this.sentence = sentence.trim();
    this.source = source;
    this.title = title;
    this.url = url;
  }

  String getText() {
    return sentence;
  }

  String getSource() {
    return source;
  }

  String getTitle() {
    return title;
  }

  String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    return sentence;
  }
  
}
