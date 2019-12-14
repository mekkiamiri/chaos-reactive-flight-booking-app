/**
 * Configure your Gatsby site with this file.
 *
 * See: https://www.gatsbyjs.org/docs/gatsby-config/
 */

module.exports = {
  siteMetadata: {
		title: `Flight Details`,
	},
  plugins: [
    `gatsby-plugin-sass`,
    `gatsby-plugin-typescript`,
     {
       resolve: "gatsby-source-graphql",
       options: {
         // Arbitrary name for the remote schema Query type
         typeName: "FlightInfos",
         // Field under which the remote schema will be accessible. You'll use this in your Gatsby query
         fieldName: "flightInfos",
         // Url to query from
         url: "http://localhost:8080/graphql"
       }
     }
  ]
      
}
