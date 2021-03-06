/**
 * BSD 2-Clause License
 *
 * Copyright (c) 2016-2017, Jochen Seeber
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package me.seeber.gradle.project.base;

import org.eclipse.jdt.annotation.Nullable;
import org.gradle.model.Managed;

/**
 * General project configuration
 */
@Managed
public interface ProjectConfig {

    /**
     * Get the year the project was created
     *
     * @return Year the project was created
     */
    public @Nullable Integer getInceptionYear();

    /**
     * Set the year the project was created
     *
     * @param year Year the project was created
     */
    public void setInceptionYear(@Nullable Integer year);

    /**
     * Get the URL of the project's web site
     *
     * @return URL of the project's web site
     */
    public @Nullable String getWebsiteUrl();

    /**
     * Set the URL of the project's web site
     *
     * @param url URL of the project's web site
     */
    public void setWebsiteUrl(@Nullable String url);

    /**
     * Get the license configuration
     *
     * @return License configuration
     */
    public License getLicense();

    /**
     * Get the version control configuration
     *
     * @return Version control configuration
     */
    public VersionControl getVersionControl();

    /**
     * Get the repository configuration
     *
     * @return Repository configuration
     */
    public Repository getRepository();

    /**
     * Get the issue tracker configuration
     *
     * @return Issue Tracker configuration
     */
    public IssueTracker getIssueTracker();

    /**
     * Get the release configuration
     *
     * @return Release configuration
     */
    public Release getRelease();

    /**
     * Get the Organization configuration
     *
     * @return Organization configuration
     */
    public Organization getOrganization();

    /**
     * Get if the plugin should add debug tasks to the project
     *
     * @return <code>true</code> if the plugin should add debug tasks to the project
     */
    public boolean isEnableDebugTasks();

    /**
     * Set if the plugin should add debug tasks to the project
     *
     * @param enableDebugTasks <code>true</code> if the plugin should add debug tasks to the project
     */
    public void setEnableDebugTasks(boolean enableDebugTasks);

    /**
     * Get the required Gradle version
     *
     * @return Required Gradle version
     */
    public String getGradleVersion();

    /**
     * Set the required Gradle version
     *
     * @param version Required Gradle version
     */
    public void setGradleVersion(String version);

}
