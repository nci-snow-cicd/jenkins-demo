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
     properties {
        office365ConnectorWebhooks {
            webhooks {
                webhook {
                    name('Teams Webhook')
                    url('https://outlook.office.com/webhook/6faa453a-84bf-4bfb-8a01-c0373d260d02@a5c2ab90-5b50-4606-9f1d-83c879f0a49f/IncomingWebhook/2bb9efbe59534841bc7f4ba1f8f787dd/4088b722-d5d7-4c04-b7af-4b2a5ea227cb')
                    startNotification(true)
                    notifySuccess(true)
                    notifyAborted(true)
                    notifyNotBuilt(true)
                    notifyUnstable(true)
                    notifyFailure(true)
                    notifyBackToNormal(true)
                    notifyRepeatedFailure(true)
                    timeout(30000)
                }
            }
        }
    }
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
                    scriptPath('sonarcube-docker')
                }
            }
        }
    }
}
pipelineJob('apc-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nci-snow-cicd/nci-webtools-dceg-age-period-cohort.git'
                    }
                    branch 'master'
                    scriptPath('apc-docker')
                }
            }
        }
    }
}
