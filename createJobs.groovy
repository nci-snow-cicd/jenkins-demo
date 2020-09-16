pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/spring-boot-api-example.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}
pipelineJob('jenkins-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/jenkins-demo.git'
                    }
                    branch 'master'
                    scriptPath('Jenkins-docker')
                }
            }
        }
    }
}
pipelineJob('ubuntu-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/ubuntu.git'
                    }
                    branch 'master'
                    scriptPath('ubuntu-docker')
                }
            }
        }
    }
}
pipelineJob('alpine-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/alpine.git'
                    }
                    branch 'master'
                    scriptPath('alpine-docker')
                }
            }
        }
    }
}
pipelineJob('sonarcube-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/sonarcube.git'
                    }
                    branch 'master'
                    scriptPath('alpine-docker')
                }
            }
        }
    }
}
