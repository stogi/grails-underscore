def version = '1.5.2'

modules = {
	'underscore' {
		resource id: 'js', url: [plugin: 'underscore', dir: 'js/underscore', file: "underscore-${version}.js"], nominify: true
	}
}
