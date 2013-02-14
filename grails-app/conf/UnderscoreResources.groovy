def version = '1.4.4'

modules = {
	'underscore' {
		resource id: 'js', url: [plugin: 'underscore', dir: 'js/underscore', file: "underscore-${version}.js"], nominify: true
	}
}