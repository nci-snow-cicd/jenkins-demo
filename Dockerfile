FROM jenkins/jenkins:2.256

USER root
RUN bash
RUN chmod 1777 /tmp
RUN chmod -R 1777 /var/tmp
RUN apt-get clean
RUN rm -rf /var/lib/apt/lists/*
RUN apt-get update
RUN curl -fsSL https://get.docker.com -o get-docker.sh
RUN sh get-docker.sh

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
