# T2 QC Plugin #

Provides the T2QC (`neuroinfo:t2qc`) data type and report page for XNAT. The T2QC pipeline itself
runs as a container (see the `main` branch and `command.json`); this plugin defines the assessor data type the
pipeline writes its results to.

This is the XNAT Works fork of [harvard-nrg/t2qc](https://github.com/harvard-nrg/t2qc). The `xnat-1.10` branch
upgrades the upstream `xnat-1.8` plugin to **XNAT 1.10+ and Java 21**:

* Gradle 8.14 wrapper and `xnat-data-builder` 1.10.1
* Java 21 source and target compatibility
* An `@XnatPlugin` class that registers the plugin and the `neuroinfo:t2qc` data model
* Removed leftover XNAT template-plugin files (sample screens and an unused site-settings form)

The boldqc, anatqc and t2qc plugins share the `neuroinfo` schema namespace and can be installed together.
They each ship the same `xnat_imageSessionData_assessments.vm` override (adds a Name column to a session's
assessment list); keep that file identical across the three repositories.

# Building #

1. Build the plugin: `./gradlew clean jar`. This builds **build/libs/t2qc-plugin-1.1.0.jar**.
1. Copy the plugin jar to your XNAT plugins folder, e.g. `cp build/libs/t2qc-plugin-1.1.0.jar /data/xnat/home/plugins`, and restart Tomcat.
