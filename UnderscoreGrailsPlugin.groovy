class UnderscoreGrailsPlugin {

	def version = '1.3.3'
	def grailsVersion = '2.1 > *'
	def dependsOn = [:]
	def pluginExcludes = [
			'grails-app/views/error.gsp'
	]

	def title = 'Underscore Plugin'
	def author = 'Michael Stogowski'
	def authorEmail = 'stogi86@gmail.com'
	def description = '''\
Simple plugin wrapper for useful Underscore.js library.
'''

	def documentation = 'http://grails.org/plugin/underscore'

	// License: one of 'APACHE', 'GPL2', 'GPL3'
	def license = 'APACHE'

	// Location of the plugin's issue tracker.
//    def issueManagement = [ system: 'JIRA', url: 'http://jira.grails.org/browse/GPMYPLUGIN' ]

	// Online location of the plugin's browseable source code.
//    def scm = [ url: 'http://svn.codehaus.org/grails-plugins/' ]

}