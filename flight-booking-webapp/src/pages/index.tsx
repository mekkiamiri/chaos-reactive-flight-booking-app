import React from "react"
import { graphql } from 'gatsby'


interface FlightDetailsPageProps {
    data: {
        flightInfos: {
            flightDetails: {
                status: String,
                bookingDate: String,
                ticketingDate: String,
                cancelDate: String,
                ticketNumber: String
            }
        }      
    }
  }
    
  export const FlightDetailsPageQuery = graphql`
    query  {
        flightInfos {
            flightDetails(origin: "par", destination: "mar") {
                status
                bookingDate
            }
        }
        
    }
  `
  
export default class IndexPage extends React.Component<FlightDetailsPageProps, {}> {
    public render() {
        const {
            status,
            bookingDate
          } = this.props.data.flightInfos.flightDetails
        return (
          <div>
            <h1>flight shoppig</h1>
            <p>search result</p>
            <p>{bookingDate}</p>
            <p>{status}</p>
          </div>
        )
      }
}
