# CS-305: Software Security
Repository dedicated to my course CS-305: Software Security

# Client Overview
Artemis Financial is a consulting company developing individualized financial plans for its customers.\
As part of modernizing their operations, Artemis Financial aimed to increase the security of their Web API.

# Vulnerabilities and Secure Coding
After identifying vulnerabilities in the client's software, I was able to determine steps to increase the layers of security for the Web API. By doing so, we can maintain the trust of the customer base by decreasing the risk of data exposure, which would erode the trust of the customers and risk significant business impact. Incorporating secure coding practices in combination with the latest updates to dependencies, vulnerabilities can be minimized, potentially saving the business from costly data breaches of its customers, employees, or business practices.\
\
At first, identifying which dependencies were applicable to the Software Composition Analysis' Dependency Check Report was challenging. I didn't quite understand how to determine which Common Vulnerability Exposure codes were truly applicable to the dependency, where I later learned was connected to the implemented version and features that were incorporated into the code base.

# Increasing Layers of Security
Throughout the consultation project for Artemis Financial, I had taken several measures to increase security.\
1. Recommended an appropriate encryption algorithm--AES-256 accompanied by ML-KEM-1024
2. Generated a self-signed certificate using the standard library Java Keytool
3. Deployed the hashing algorithm SHA-256 with RSA encryption to create the checksum verification
4. Refactored the codebase to convert HTTP protocol to HTTPS
5. Ran the Dependency Check to evaluate for any potential new vulnerabilities
6. Manually reviewed the source code for any logical or syntactical vulnerabilities\

In the future, I'd recommend the client incorporate pentesting prior to deployment and ongoing Dynamic Application Security Testing (DAST) while the deployed code is live. This would allow further insight into potential vulnerabilities that were not discovered during the project.

# Functional and Secure
To ensure the code was functional, I had compiled the source code and ran the server locally to evaluate successful launch of the program. It functioned as expected without error. I tested the HTTPS connection and verified the cryptographic hash function successfully generated the checksum verification. For security, I ran the OWASP Dependency Check and reviewed the results for any new potential security vulnerabilities. Afterwards, I had completed a manual code review for any syntax, logical, or business process vulnerabilities without compromising existing application functionality.

# Resources and Tools That May Be Helpful
Beyond the OWASP Dependency Check, I'd also like to incorporate an additional SCA tool such as Snyk's Open Source SCA, or Snyk Code while developing for faster patching. Additionally, the OWASP ZAP as a tactic to run Dynamic Application Security Testing.

# Employer Highlights
From this project, I'd be excited to show them the implementation of the checksum verification and certificate generation as tangible production. Relative to speaking about the project, I'd like to speak on the points of the various layers of security that I've added to the application.
