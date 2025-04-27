const calendarData = {
    "winter-2025": [
        { date: "December 23", event: "First day of Winter 2025 Semester" },
        { date: "December 24", event: "Christmas Eve – No Classes" },
        { date: "December 25", event: "Christmas Day – University Closed" },
        { date: "January 1", event: "New Year's Day – University Closed" },
        { date: "January 15", event: "Last day of Winter 2025 Semester" }
    ],
    "spring-2025": [
        { date: "January 17", event: "First day of Spring Semester" },
        { date: "March 7", event: "Last day of Session B" },
        { date: "March 8-16", event: "Spring Break" },
        { date: "May 5", event: "Last day of Spring Semester" }
    ]
};

function filterDates() {
    const semester = document.getElementById("semester").value;
    const calendarDiv = document.getElementById("calendar");
    calendarDiv.innerHTML = "";

    let events = semester === "all" ? Object.values(calendarData).flat() : calendarData[semester] || [];

    events.forEach(event => {
        let eventElement = document.createElement("p");
        eventElement.textContent = `${event.date}: ${event.event}`;
        calendarDiv.appendChild(eventElement);
    });
}

document.addEventListener("DOMContentLoaded", filterDates);
